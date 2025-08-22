package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SHARP device specifications for Android Compose previews.
 *
 * This extension provides SHARP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SHARP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SHARP: Any
  get() = object {
      /** DeviceSpec(manufacturer=SHARP, code=anaheim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=anaheim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=an_np40, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=an_np40, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AN_NP40 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=awaroa, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=awaroa, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val AWAROA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=Banagher, width=1440, height=3168, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Banagher, width=1440,
      height=3168, dpi=640, isGoogleDevice=false).code */
      val BANAGHER = "spec:width=1440,height=3168,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SHARP, code=banqiao, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=banqiao, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANQIAO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=Chara, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Chara, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val CHARA = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SHARP, code=ebisu, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=ebisu, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EBISU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=egaleo, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=egaleo, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val EGALEO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=ewha, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=ewha, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=FaYuiry, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=FaYuiry, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val FAYUIRY = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHARP, code=gangnam, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=gangnam, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGNAM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=gilmore, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=gilmore, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val GILMORE = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=guro, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=guro, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GURO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=HCTT1, width=768, height=1366, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=HCTT1, width=768,
      height=1366, dpi=160, isGoogleDevice=false).code */
      val HCTT1 = "spec:width=768,height=1366,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SHARP, code=HH1, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=HH1, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val HH1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=HH6_sprout, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=HH6_sprout, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val HH6_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHARP, code=jamsil, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=jamsil, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val JAMSIL = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=JeridA, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=JeridA, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val JERIDA = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=Judau, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Judau, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val JUDAU = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=Kamille, width=1260, height=2730, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Kamille, width=1260,
      height=2730, dpi=480, isGoogleDevice=false).code */
      val KAMILLE = "spec:width=1260,height=2730,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=lavender, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lavender, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_le580t, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_le580t, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_LE580T = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_le580x, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_le580x, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_LE580X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_sunuj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_sunuj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_SUNUJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_theut, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_theut, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_THEUT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_theux, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_theux, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_THEUX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_u35t, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_u35t, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_U35T = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_ue630x, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_ue630x, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_UE630X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_xu35t, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_xu35t, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_XU35T = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=lc_xu930x_830x, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=lc_xu930x_830x,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val LC_XU930X_830X = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=LC-xxLE570X, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=LC-xxLE570X,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val LC_XXLE570X = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SHARP, code=Levin, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Levin, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val LEVIN = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=Lockon, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Lockon, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val LOCKON = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHARP, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=meguro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=meguro, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MEGURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=Mikazuki, width=1440, height=3120, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Mikazuki, width=1440,
      height=3120, dpi=520, isGoogleDevice=false).code */
      val MIKAZUKI = "spec:width=1440,height=3120,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=SHARP, code=Model_3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Model_3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MODEL_3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=mongkok, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=mongkok, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MONGKOK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=MS1, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=MS1, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MS1 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=namba, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=namba, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAMBA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=Naze, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Naze, width=1080,
      height=2340, dpi=440, isGoogleDevice=false).code */
      val NAZE = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SHARP, code=OD0M_EA_T32, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=OD0M_EA_T32,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val OD0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=OG6, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=OG6, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val OG6 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SHARP, code=Orga, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Orga, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val ORGA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHARP, code=Quattro, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Quattro, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val QUATTRO = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHARP, code=Quess, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Quess, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val QUESS = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SHARP, code=R4, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=R4, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R4 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=Rakan, width=1080, height=2432, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Rakan, width=1080,
      height=2432, dpi=440, isGoogleDevice=false).code */
      val RAKAN = "spec:width=1080,height=2432,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SHARP, code=Recoa, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Recoa, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val RECOA = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHARP, code=sandiego, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=sandiego, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SANDIEGO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=Sarah, width=1080, height=2280, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=Sarah, width=1080,
      height=2280, dpi=440, isGoogleDevice=false).code */
      val SARAH = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SHARP, code=SarahH, width=1080, height=2280, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SarahH, width=1080,
      height=2280, dpi=440, isGoogleDevice=false).code */
      val SARAHH = "spec:width=1080,height=2280,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=SHARP, code=SAT, width=1080, height=2040, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SAT, width=1080,
      height=2040, dpi=480, isGoogleDevice=false).code */
      val SAT = "spec:width=1080,height=2040,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SD1, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SD1, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SD1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SG1, width=1080, height=2040, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SG1, width=1080,
      height=2040, dpi=420, isGoogleDevice=false).code */
      val SG1 = "spec:width=1080,height=2040,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHARP, code=SG306SH, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SG306SH, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SG306SH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SH825Wi, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH825Wi, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SH825WI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SH90B, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH90B, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH90B = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=sharp_2k15_us_android, width=1080, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP,
      code=sharp_2k15_us_android, width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SHARP_2K15_US_ANDROID = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=shinagawa, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=shinagawa, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=shonandai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=shonandai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHONANDAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=SH-D01, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-D01, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SH_D01 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-L02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-L02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SH_L02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M01, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M01, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_M01 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SH_M02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M02-EVA20, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M02-EVA20,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SH_M02_EVA20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M03, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M03, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_M03 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M04, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M04, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SH_M04 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M05, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M05, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val SH_M05 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M06, width=1080, height=2032, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M06, width=1080,
      height=2032, dpi=480, isGoogleDevice=false).code */
      val SH_M06 = "spec:width=1080,height=2032,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M07, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M07, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SH_M07 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M08, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M08, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SH_M08 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M09, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M09, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val SH_M09 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M10, width=1440, height=2992, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M10, width=1440,
      height=2992, dpi=640, isGoogleDevice=false).code */
      val SH_M10 = "spec:width=1440,height=2992,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M11, width=1080, height=2220, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M11, width=1080,
      height=2220, dpi=480, isGoogleDevice=false).code */
      val SH_M11 = "spec:width=1080,height=2220,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M12, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M12, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val SH_M12 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-M13, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-M13, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val SH_M13 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-R10, width=1440, height=3120, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-R10, width=1440,
      height=3120, dpi=640, isGoogleDevice=false).code */
      val SH_R10 = "spec:width=1440,height=3120,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SHARP, code=SH-RM02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-RM02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SH_RM02 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SH-Z01, width=1080, height=2040, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-Z01, width=1080,
      height=2040, dpi=480, isGoogleDevice=false).code */
      val SH_Z01 = "spec:width=1080,height=2040,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=SH-Z10, width=1440, height=2992, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-Z10, width=1440,
      height=2992, dpi=640, isGoogleDevice=false).code */
      val SH_Z10 = "spec:width=1440,height=2992,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=SHARP, code=SH-Z20, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SH-Z20, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val SH_Z20 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=sindang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=sindang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SS2, width=1080, height=2040, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SS2, width=1080,
      height=2040, dpi=480, isGoogleDevice=false).code */
      val SS2 = "spec:width=1080,height=2040,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=stanford, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=stanford, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=STTM21VAPP, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=STTM21VAPP, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val STTM21VAPP = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SHARP, code=SW6H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SW6H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=SX1, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SX1, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SX1 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SHARP, code=SX3, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SX3, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val SX3 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SHARP, code=SX4, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SX4, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SX4 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SHARP, code=SX5, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=SX5, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val SX5 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=SHARP, code=takao, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=takao, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAKAO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=tcba8sx, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcba8sx, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCBA8SX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcmar1uj, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcmar1uj, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val TCMAR1UJ = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcmar2uj, width=2160, height=3840, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcmar2uj, width=2160,
      height=3840, dpi=320, isGoogleDevice=false).code */
      val TCMAR2UJ = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcme8sj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcme8sj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCME8SJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcme8tsj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcme8tsj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCME8TSJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcmeruj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcmeruj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCMERUJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcsu2uj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcsu2uj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCSU2UJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcth2ut, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcth2ut, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCTH2UT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcth2ux, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcth2ux, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCTH2UX = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcve2uj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcve2uj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCVE2UJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcve8sj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcve8sj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCVE8SJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcvenruj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcvenruj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCVENRUJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=tcvenuj, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=tcvenuj, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val TCVENUJ = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SHARP, code=TSP, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=TSP, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val TSP = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=umeda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=umeda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SHARP, code=VG2, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=VG2, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val VG2 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SHARP, code=VGO, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=VGO, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val VGO = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=SHARP, code=VN3N, width=1440, height=2560, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=VN3N, width=1440,
      height=2560, dpi=560, isGoogleDevice=false).code */
      val VN3N = "spec:width=1440,height=2560,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=SHARP, code=VZJ, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SHARP, code=VZJ, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VZJ = "spec:width=720,height=1280,unit=px,dpi=320"

  }
