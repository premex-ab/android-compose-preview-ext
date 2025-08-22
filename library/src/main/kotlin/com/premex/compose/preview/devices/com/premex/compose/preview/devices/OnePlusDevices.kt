package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OnePlus device specifications for Android Compose previews.
 *
 * This extension provides OnePlus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OnePlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OnePlus: Any
  get() = object {
      /** DeviceSpec(manufacturer=OnePlus, code=Cebu, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=Cebu, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val CEBU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OnePlus, code=Dubai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=Dubai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val DUBAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=OnePlus, code=Edinburgh, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=Edinburgh,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val EDINBURGH = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OnePlus, code=Nord, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=Nord, width=1080,
      height=2400, dpi=450, isGoogleDevice=false).code */
      val NORD = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus3, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus3, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val ONEPLUS3 = "spec:width=1080,height=1920,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus5T, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus5T,
      width=1080, height=2160, dpi=420, isGoogleDevice=false).code */
      val ONEPLUS5T = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus6, width=1080, height=2280, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus6, width=1080,
      height=2280, dpi=450, isGoogleDevice=false).code */
      val ONEPLUS6 = "spec:width=1080,height=2280,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus6T, width=1080, height=2340, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus6T,
      width=1080, height=2340, dpi=450, isGoogleDevice=false).code */
      val ONEPLUS6T = "spec:width=1080,height=2340,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus6TSingle, width=1080, height=2340, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus6TSingle,
      width=1080, height=2340, dpi=450, isGoogleDevice=false).code */
      val ONEPLUS6TSINGLE = "spec:width=1080,height=2340,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus7, width=1080, height=2340, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus7, width=1080,
      height=2340, dpi=450, isGoogleDevice=false).code */
      val ONEPLUS7 = "spec:width=1080,height=2340,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus7Pro, width=1440, height=3120, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus7Pro,
      width=1440, height=3120, dpi=600, isGoogleDevice=false).code */
      val ONEPLUS7PRO = "spec:width=1440,height=3120,unit=px,dpi=600"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus7ProNR, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus7ProNR,
      width=1440, height=3120, dpi=560, isGoogleDevice=false).code */
      val ONEPLUS7PRONR = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus7ProTMO, width=1440, height=3120, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus7ProTMO,
      width=1440, height=3120, dpi=600, isGoogleDevice=false).code */
      val ONEPLUS7PROTMO = "spec:width=1440,height=3120,unit=px,dpi=600"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus7T, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus7T,
      width=1080, height=2400, dpi=450, isGoogleDevice=false).code */
      val ONEPLUS7T = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus7TPro, width=1440, height=3120, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus7TPro,
      width=1440, height=3120, dpi=600, isGoogleDevice=false).code */
      val ONEPLUS7TPRO = "spec:width=1440,height=3120,unit=px,dpi=600"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus7TProNR, width=1440, height=3120, dpi=600,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus7TProNR,
      width=1440, height=3120, dpi=600, isGoogleDevice=false).code */
      val ONEPLUS7TPRONR = "spec:width=1440,height=3120,unit=px,dpi=600"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus7TTMO, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus7TTMO,
      width=1080, height=2400, dpi=450, isGoogleDevice=false).code */
      val ONEPLUS7TTMO = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus8, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus8, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS8 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus8T, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus8T,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS8T = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus8TMO, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus8TMO,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS8TMO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus8TTMO, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus8TTMO,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS8TTMO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus8Visible, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus8Visible,
      width=1080, height=2400, dpi=450, isGoogleDevice=false).code */
      val ONEPLUS8VISIBLE = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus8VZW, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus8VZW,
      width=1080, height=2400, dpi=450, isGoogleDevice=false).code */
      val ONEPLUS8VZW = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus9, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus9, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS9 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus9ProTMO, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus9ProTMO,
      width=1080, height=2412, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS9PROTMO = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus9R, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus9R,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS9R = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlus9TMO, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlus9TMO,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUS9TMO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlusN10, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlusN10,
      width=1080, height=2400, dpi=450, isGoogleDevice=false).code */
      val ONEPLUSN10 = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlusN100, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlusN100,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val ONEPLUSN100 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlusN100METRO, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlusN100METRO,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val ONEPLUSN100METRO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlusN100TMO, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlusN100TMO,
      width=720, height=1600, dpi=300, isGoogleDevice=false).code */
      val ONEPLUSN100TMO = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlusN10METRO, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlusN10METRO,
      width=1080, height=2400, dpi=450, isGoogleDevice=false).code */
      val ONEPLUSN10METRO = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlusN10TMO, width=1080, height=2400, dpi=450,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlusN10TMO,
      width=1080, height=2400, dpi=450, isGoogleDevice=false).code */
      val ONEPLUSN10TMO = "spec:width=1080,height=2400,unit=px,dpi=450"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlusN200, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlusN200,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUSN200 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OnePlusN200TMO, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OnePlusN200TMO,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val ONEPLUSN200TMO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5154L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5154L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5154L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5155L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5155L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5155L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5159L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5159L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5159L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP515AL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP515AL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP515AL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP515BL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP515BL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP515BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP516EL1, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP516EL1, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP516EL1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP535DL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP535DL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP535DL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP555BL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP555BL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP555BL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5565, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5565, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5565 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5566L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5566L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5566L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5567L1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5567L1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5567L1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP556FL1, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP556FL1, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP556FL1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP557AL1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP557AL1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP557AL1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5911, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5911, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5911 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP591BL1, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP591BL1, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP591BL1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5927, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5927, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP5927 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5929L1, width=1440, height=3216, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5929L1, width=1440,
      height=3216, dpi=640, isGoogleDevice=false).code */
      val OP5929L1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5943L1, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5943L1, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP5943L1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP594DL1, width=1440, height=3216, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP594DL1, width=1440,
      height=3216, dpi=480, isGoogleDevice=false).code */
      val OP594DL1 = "spec:width=1440,height=3216,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5955L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5955L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5955L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5958L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5958L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5958L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP595DL1, width=1440, height=3216, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP595DL1, width=1440,
      height=3216, dpi=640, isGoogleDevice=false).code */
      val OP595DL1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5961L1, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5961L1, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP5961L1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5973L1, width=2268, height=2440, dpi=520,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5973L1, width=2268,
      height=2440, dpi=520, isGoogleDevice=false).code */
      val OP5973L1 = "spec:width=2268,height=2440,unit=px,dpi=520"

      /** DeviceSpec(manufacturer=OnePlus, code=OP59BCL1, width=2000, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP59BCL1, width=2000,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val OP59BCL1 = "spec:width=2000,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5CF9L1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5CF9L1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP5CF9L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5CFBL1, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5CFBL1, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP5CFBL1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D06L1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D06L1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP5D06L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D0DL1, width=1440, height=3216, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D0DL1, width=1440,
      height=3216, dpi=640, isGoogleDevice=false).code */
      val OP5D0DL1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D2BL1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D2BL1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP5D2BL1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D35L1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D35L1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP5D35L1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D3BL1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D3BL1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP5D3BL1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D3FL1, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D3FL1, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val OP5D3FL1 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D49L1, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D49L1, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val OP5D49L1 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D55L1, width=1440, height=3216, dpi=640,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D55L1, width=1440,
      height=3216, dpi=640, isGoogleDevice=false).code */
      val OP5D55L1 = "spec:width=1440,height=3216,unit=px,dpi=640"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5D77L1, width=2120, height=3000, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5D77L1, width=2120,
      height=3000, dpi=420, isGoogleDevice=false).code */
      val OP5D77L1 = "spec:width=2120,height=3000,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5DA6L1, width=1720, height=2408, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5DA6L1, width=1720,
      height=2408, dpi=360, isGoogleDevice=false).code */
      val OP5DA6L1 = "spec:width=1720,height=2408,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5DAAL1, width=2120, height=3000, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5DAAL1, width=2120,
      height=3000, dpi=420, isGoogleDevice=false).code */
      val OP5DAAL1 = "spec:width=2120,height=3000,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OnePlus, code=OP5E93L1, width=1240, height=2772, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP5E93L1, width=1240,
      height=2772, dpi=560, isGoogleDevice=false).code */
      val OP5E93L1 = "spec:width=1240,height=2772,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP60EBL1, width=1264, height=2780, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP60EBL1, width=1264,
      height=2780, dpi=560, isGoogleDevice=false).code */
      val OP60EBL1 = "spec:width=1264,height=2780,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP60EDL1, width=1272, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP60EDL1, width=1272,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP60EDL1 = "spec:width=1272,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP60F5L1, width=1216, height=2640, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP60F5L1, width=1216,
      height=2640, dpi=560, isGoogleDevice=false).code */
      val OP60F5L1 = "spec:width=1216,height=2640,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP60F9L1, width=1080, height=2392, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP60F9L1, width=1080,
      height=2392, dpi=480, isGoogleDevice=false).code */
      val OP60F9L1 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP612BL1, width=1216, height=2640, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP612BL1, width=1216,
      height=2640, dpi=560, isGoogleDevice=false).code */
      val OP612BL1 = "spec:width=1216,height=2640,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP6131L1, width=1272, height=2800, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP6131L1, width=1272,
      height=2800, dpi=560, isGoogleDevice=false).code */
      val OP6131L1 = "spec:width=1272,height=2800,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OP613BL1, width=1080, height=2392, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP613BL1, width=1080,
      height=2392, dpi=480, isGoogleDevice=false).code */
      val OP613BL1 = "spec:width=1080,height=2392,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=OnePlus, code=OP615AL1, width=2000, height=2800, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP615AL1, width=2000,
      height=2800, dpi=400, isGoogleDevice=false).code */
      val OP615AL1 = "spec:width=2000,height=2800,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=OnePlus, code=OP615EL1, width=2400, height=3392, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP615EL1, width=2400,
      height=3392, dpi=420, isGoogleDevice=false).code */
      val OP615EL1 = "spec:width=2400,height=3392,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OnePlus, code=OP6190L1, width=2400, height=3392, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP6190L1, width=2400,
      height=3392, dpi=420, isGoogleDevice=false).code */
      val OP6190L1 = "spec:width=2400,height=3392,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=OnePlus, code=OP6195L1, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP6195L1, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val OP6195L1 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=OnePlus, code=OP7ProNRSpr, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OP7ProNRSpr,
      width=1440, height=3120, dpi=560, isGoogleDevice=false).code */
      val OP7PRONRSPR = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=OnePlus, code=OPWE242, width=466, height=466, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OPWE242, width=466,
      height=466, dpi=360, isGoogleDevice=false).code */
      val OPWE242 = "spec:width=466,height=466,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=OnePlus, code=OPWWE231, width=466, height=466, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OPWWE231, width=466,
      height=466, dpi=320, isGoogleDevice=false).code */
      val OPWWE231 = "spec:width=466,height=466,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OnePlus, code=OPWWE234, width=466, height=466, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OPWWE234, width=466,
      height=466, dpi=320, isGoogleDevice=false).code */
      val OPWWE234 = "spec:width=466,height=466,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OnePlus, code=OPWWE251, width=466, height=466, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=OPWWE251, width=466,
      height=466, dpi=320, isGoogleDevice=false).code */
      val OPWWE251 = "spec:width=466,height=466,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OnePlus, code=shibuya, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OnePlus, code=shibuya, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
