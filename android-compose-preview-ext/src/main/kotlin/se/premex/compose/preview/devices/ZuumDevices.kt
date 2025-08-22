package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZUUM device specifications for Android Compose previews.
 *
 * This extension provides ZUUM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zuum.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zuum: Any
  get() = object {
      /** ZUUM AKUS */
      val AKUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ZUUM AKUS_P1 */
      val AKUS_P1 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM AKUS_PRO */
      val AKUS_PRO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** ZUUM AKUS_TAB */
      val AKUS_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZUUM Akus_Z */
      val AKUS_Z = "spec:width=480,height=960,unit=px,dpi=240"

      /** ZUUM AKUS_Z1 */
      val AKUS_Z1 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ZUUM Aura_M1 */
      val AURA_M1 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** ZUUM AURA_M2 */
      val AURA_M2 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** ZUUM AURA_PLUS_JLO */
      val AURA_PLUS_JLO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** ZUUM AURA_PRO */
      val AURA_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM AURA_PRO_JLO */
      val AURA_PRO_JLO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM AURA_X */
      val AURA_X = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** ZUUM AURA_Z */
      val AURA_Z = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM Aura_Z1 */
      val AURA_Z1 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** ZUUM COVET */
      val COVET = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ZUUM COVET_PRO */
      val COVET_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ZUUM COVET_PRO_LITE */
      val COVET_PRO_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ZUUM COVET_X */
      val COVET_X = "spec:width=480,height=960,unit=px,dpi=200"

      /** ZUUM COVET_Z */
      val COVET_Z = "spec:width=480,height=960,unit=px,dpi=240"

      /** ZUUM GRANT */
      val GRANT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ZUUM Gravity */
      val GRAVITY = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ZUUM GRAVITY_M */
      val GRAVITY_M = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** ZUUM GRAVITY_Z */
      val GRAVITY_Z = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ZUUM Hidra_Plus */
      val HIDRA_PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** ZUUM MAGNO_C */
      val MAGNO_C = "spec:width=480,height=854,unit=px,dpi=240"

      /** ZUUM MAGNO_C1 */
      val MAGNO_C1 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ZUUM MAGNO_C2 */
      val MAGNO_C2 = "spec:width=480,height=854,unit=px,dpi=220"

      /** ZUUM Magno_C_Plus */
      val MAGNO_C_PLUS = "spec:width=480,height=960,unit=px,dpi=200"

      /** ZUUM MAGNO_MINI */
      val MAGNO_MINI = "spec:width=360,height=640,unit=px,dpi=240"

      /** ZUUM MAGNO_P1 */
      val MAGNO_P1 = "spec:width=480,height=960,unit=px,dpi=213"

      /** ZUUM MAGNO_P4 */
      val MAGNO_P4 = "spec:width=576,height=1152,unit=px,dpi=220"

      /** ZUUM MAGNO_PLUS */
      val MAGNO_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** ZUUM Magno_Pro */
      val MAGNO_PRO = "spec:width=720,height=1560,unit=px,dpi=300"

      /** ZUUM MAGNO_S */
      val MAGNO_S = "spec:width=720,height=1612,unit=px,dpi=320"

      /** ZUUM NOVUS_TAB */
      val NOVUS_TAB = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ZUUM ONIX */
      val ONIX = "spec:width=480,height=854,unit=px,dpi=240"

      /** ZUUM ONIX_S */
      val ONIX_S = "spec:width=480,height=960,unit=px,dpi=240"

      /** ZUUM ROCKET_II */
      val ROCKET_II = "spec:width=480,height=800,unit=px,dpi=240"

      /** ZUUM ROCKET_III */
      val ROCKET_III = "spec:width=720,height=1600,unit=px,dpi=300"

      /** ZUUM SENS_CURVE */
      val SENS_CURVE = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** ZUUM SENS_G */
      val SENS_G = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** ZUUM STELLAR_M1 */
      val STELLAR_M1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ZUUM STELLAR_M2 */
      val STELLAR_M2 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** ZUUM STELLAR_M3 */
      val STELLAR_M3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM STELLAR_M4 */
      val STELLAR_M4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM STELLAR_M5 */
      val STELLAR_M5 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** ZUUM STELLAR_M6 */
      val STELLAR_M6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM Stellar_Max */
      val STELLAR_MAX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM STELLAR_MINI */
      val STELLAR_MINI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ZUUM STELLAR_P3 */
      val STELLAR_P3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** ZUUM STELLAR_P4 */
      val STELLAR_P4 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM STELLAR_P5 */
      val STELLAR_P5 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** ZUUM STELLAR_P6 */
      val STELLAR_P6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ZUUM STELLAR_P8 */
      val STELLAR_P8 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** ZUUM STELLAR_PLUS */
      val STELLAR_PLUS = "spec:width=720,height=1500,unit=px,dpi=320"

      /** ZUUM STELLAR_Z */
      val STELLAR_Z = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ZUUM VOLTA_KIDS */
      val VOLTA_KIDS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ZUUM ZUUM_PAD_Kids */
      val ZUUM_PAD_KIDS = "spec:width=600,height=1024,unit=px,dpi=200"

      /** ZUUM ZUUM_PAD_Lightyear */
      val ZUUM_PAD_LIGHTYEAR = "spec:width=600,height=1024,unit=px,dpi=200"

  }
