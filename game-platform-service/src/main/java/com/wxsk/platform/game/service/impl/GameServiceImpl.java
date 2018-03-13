package com.wxsk.platform.game.service.impl;

import com.wxsk.common.base.service.impl.BaseServiceImpl;
import com.wxsk.platform.game.dao.GameMapper;
import com.wxsk.platform.game.dao.param.GameRequestParam;
import com.wxsk.platform.game.entity.Game;
import com.wxsk.platform.game.service.GameService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(rollbackFor = Exception.class)
@Service
public class GameServiceImpl extends BaseServiceImpl<Game,GameMapper> implements GameService {

    private GameMapper gameMapper;

    @Override
    public List<Game> queryByParamMap(GameRequestParam param) {
        return null;
    }

    @Override
    public GameMapper getDefaulteMapper() {
        return gameMapper;
    }

    public GameServiceImpl(GameMapper gameMapper) {
        this.gameMapper = gameMapper;
    }
}
