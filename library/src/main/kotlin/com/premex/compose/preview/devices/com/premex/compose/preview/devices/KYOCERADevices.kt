package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KYOCERA device specifications for Android Compose previews.
 *
 * This extension provides KYOCERA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KYOCERA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KYOCERA: Any
  get() = object {
      /** DeviceSpec(manufacturer=KYOCERA, code=A001KC, width=720, height=1480, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=A001KC, width=720,
      height=1480, dpi=320, isGoogleDevice=false).code */
      val A001KC = "spec:width=720,height=1480,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=A201KC, width=720, height=1480, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=A201KC, width=720,
      height=1480, dpi=320, isGoogleDevice=false).code */
      val A201KC = "spec:width=720,height=1480,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=E6810_3GB, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E6810_3GB,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val E6810_3GB = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=E6820, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E6820, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6820 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=E6820TM_3GB, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E6820TM_3GB,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val E6820TM_3GB = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=E6820_3GB, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E6820_3GB,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val E6820_3GB = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=E6830, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E6830, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6830 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=E6833, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E6833, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6833 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=E6910, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E6910, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6910 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=E6920, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E6920, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E6920 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=E7110, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=E7110, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val E7110 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KCP01K, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KCP01K, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KCP01K = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-01, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-01, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KC_01 = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-100S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-100S, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KC_100S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-S301AE, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-S301AE, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val KC_S301AE = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-S303, width=1080, height=2280, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-S303, width=1080,
      height=2280, dpi=400, isGoogleDevice=false).code */
      val KC_S303 = "spec:width=1080,height=2280,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-S304, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-S304, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val KC_S304 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-S701, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-S701, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KC_S701 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-S702, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-S702, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KC_S702 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-T302DT, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-T302DT, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val KC_T302DT = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=KYOCERA, code=KC-T304, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KC-T304, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val KC_T304 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY21L-RG100, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY21L-RG100,
      width=1080, height=2400, dpi=420, isGoogleDevice=false).code */
      val KY21L_RG100 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY21L-ST100, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY21L-ST100,
      width=1080, height=2400, dpi=420, isGoogleDevice=false).code */
      val KY21L_ST100 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY22L-SN300, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY22L-SN300,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val KY22L_SN300 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY22L-ST200, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY22L-ST200,
      width=1080, height=2400, dpi=420, isGoogleDevice=false).code */
      val KY22L_ST200 = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY22M-RG100, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY22M-RG100,
      width=1080, height=2160, dpi=420, isGoogleDevice=false).code */
      val KY22M_RG100 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY23L-RG100, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY23L-RG100,
      width=720, height=1560, dpi=300, isGoogleDevice=false).code */
      val KY23L_RG100 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY23M-RG100, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY23M-RG100,
      width=1080, height=2160, dpi=420, isGoogleDevice=false).code */
      val KY23M_RG100 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY24L-SN100, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY24L-SN100,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val KY24L_SN100 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY24L-ST100, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY24L-ST100,
      width=720, height=1560, dpi=300, isGoogleDevice=false).code */
      val KY24L_ST100 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY24L-ST200, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY24L-ST200,
      width=720, height=1560, dpi=300, isGoogleDevice=false).code */
      val KY24L_ST200 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY24L-ST300, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY24L-ST300,
      width=720, height=1560, dpi=300, isGoogleDevice=false).code */
      val KY24L_ST300 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY24L-TB100, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY24L-TB100,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val KY24L_TB100 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY24L-TB200, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY24L-TB200,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val KY24L_TB200 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY24L-TB300, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY24L-TB300,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val KY24L_TB300 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYG01, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYG01, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val KYG01 = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYT32, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYT32, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KYT32 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYT33, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYT33, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val KYT33 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYT34, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYT34, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val KYT34 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV38, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV38, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV38 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV39, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV39, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV39 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV40, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV40, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV40 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV41, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV41, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV41 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV42, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV42, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KYV42 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV43, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV43, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYV43 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV44, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV44, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYV44 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV44_u2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV44_u2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYV44_U2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV45, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV45, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val KYV45 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV46, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV46, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val KYV46 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV47, width=720, height=1480, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV47, width=720,
      height=1480, dpi=320, isGoogleDevice=false).code */
      val KYV47 = "spec:width=720,height=1480,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=KYV48, width=1080, height=2280, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KYV48, width=1080,
      height=2280, dpi=420, isGoogleDevice=false).code */
      val KYV48 = "spec:width=1080,height=2280,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY-51B, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY-51B, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val KY_51B = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=KY-51D, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=KY-51D, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val KY_51D = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=KYOCERA, code=S10-KC_sprout, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=S10-KC_sprout,
      width=1080, height=2400, dpi=420, isGoogleDevice=false).code */
      val S10_KC_SPROUT = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=S2_sprout, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=S2_sprout, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S2_SPROUT = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=S4-KC_sprout, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=S4-KC_sprout,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val S4_KC_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=S6-KC_sprout, width=1080, height=2280, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=S6-KC_sprout,
      width=1080, height=2280, dpi=420, isGoogleDevice=false).code */
      val S6_KC_SPROUT = "spec:width=1080,height=2280,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=S8-KC_sprout, width=1080, height=2280, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=S8-KC_sprout,
      width=1080, height=2280, dpi=400, isGoogleDevice=false).code */
      val S8_KC_SPROUT = "spec:width=1080,height=2280,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=KYOCERA, code=S9-KC_sprout, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=S9-KC_sprout,
      width=1080, height=2400, dpi=420, isGoogleDevice=false).code */
      val S9_KC_SPROUT = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=KYOCERA, code=SKT01, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=SKT01, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val SKT01 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=X3-KC_sprout, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=X3-KC_sprout,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val X3_KC_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=404KC, width=540, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=404KC, width=540,
      height=960, dpi=240, isGoogleDevice=false).code */
      val _404KC = "spec:width=540,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KYOCERA, code=503KC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=503KC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _503KC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=602KC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=602KC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _602KC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=704KC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=704KC, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val _704KC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KYOCERA, code=705KC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=705KC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _705KC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KYOCERA, code=901KC, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KYOCERA, code=901KC, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val _901KC = "spec:width=720,height=1440,unit=px,dpi=280"

  }
