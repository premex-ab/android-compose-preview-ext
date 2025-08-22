package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SG device specifications for Android Compose previews.
 *
 * This extension provides SG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SG: Any
  get() = object {
      /** DeviceSpec(manufacturer=SG, code=eve_sprout, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=eve_sprout, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EVE_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=JeridB, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=JeridB, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val JERIDB = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=Judau, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Judau, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val JUDAU = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=JudauL, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=JudauL, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val JUDAUL = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=kaleido_sprout, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=kaleido_sprout,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val KALEIDO_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=Kamille, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Kamille, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val KAMILLE = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=KamilleL, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=KamilleL, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val KAMILLEL = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=Levil, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Levil, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val LEVIL = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=Levil5, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Levil5, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val LEVIL5 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=Lockon, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Lockon, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val LOCKON = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SG, code=Mikazuki, width=1440, height=3120, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Mikazuki, width=1440,
      height=3120, dpi=520, isGoogleDevice=false).code */
      val MIKAZUKI = "spec:width=1440,height=3120,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=SG, code=Mineva, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Mineva, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val MINEVA = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=MinevaL, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=MinevaL, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val MINEVAL = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=nasa_sprout, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=nasa_sprout, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val NASA_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=Naze, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Naze, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val NAZE = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SG, code=Nee, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Nee, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val NEE = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SG, code=OI6, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=OI6, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val OI6 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=Orga, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Orga, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val ORGA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SG, code=Quattro, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Quattro, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val QUATTRO = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SG, code=Recoa, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Recoa, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val RECOA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SG, code=rome_sprout, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=rome_sprout, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ROME_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=Sarah, width=1080, height=2280, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=Sarah, width=1080,
      height=2280, dpi=440, isGoogleDevice=false).code */
      val SARAH = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SG, code=SG304SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG304SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SG304SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG305SH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG305SH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SG305SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=SG401SH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG401SH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SG401SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=SG402SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG402SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SG402SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG403SH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG403SH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SG403SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=SG404SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG404SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SG404SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG502SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG502SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SG502SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG503SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG503SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SG503SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG506SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG506SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SG506SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG509SH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG509SH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SG509SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=SG603SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG603SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SG603SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG605SH, width=1440, height=2560, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG605SH, width=1440,
      height=2560, dpi=640, isGoogleDevice=false).code */
      val SG605SH = "spec:width=1440,height=2560,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SG, code=SG606SH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG606SH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SG606SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=SG701SH, width=1080, height=2032, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG701SH, width=1080,
      height=2032, dpi=480, isGoogleDevice=false).code */
      val SG701SH = "spec:width=1080,height=2032,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG702SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG702SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SG702SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG704SH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG704SH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SG704SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SG, code=SG706SH, width=1440, height=3040, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG706SH, width=1440,
      height=3040, dpi=640, isGoogleDevice=false).code */
      val SG706SH = "spec:width=1440,height=3040,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SG, code=SG801SH, width=1440, height=2992, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG801SH, width=1440,
      height=2992, dpi=640, isGoogleDevice=false).code */
      val SG801SH = "spec:width=1440,height=2992,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SG, code=SG803SH, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG803SH, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val SG803SH = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG808SH, width=1440, height=3120, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG808SH, width=1440,
      height=3120, dpi=640, isGoogleDevice=false).code */
      val SG808SH = "spec:width=1440,height=3120,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SG, code=SG901SH, width=1080, height=2220, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG901SH, width=1080,
      height=2220, dpi=480, isGoogleDevice=false).code */
      val SG901SH = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG906SH, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG906SH, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val SG906SH = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG907SH, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG907SH, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SG907SH = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SG908SH, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SG908SH, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val SG908SH = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SG, code=SGA002SH, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SGA002SH, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val SGA002SH = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SH-M12, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SH-M12, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SH_M12 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SW001SH, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SW001SH, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SW001SH = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=SX1, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SX1, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SX1 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SG, code=SX3, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SX3, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SX3 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SG, code=SX4, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SX4, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SX4 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SG, code=SX5, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SX5, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SX5 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SG, code=SXI, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=SXI, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SXI = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SG, code=vespa_sprout, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=vespa_sprout, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val VESPA_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SG, code=zeon_sprout, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SG, code=zeon_sprout, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val ZEON_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
