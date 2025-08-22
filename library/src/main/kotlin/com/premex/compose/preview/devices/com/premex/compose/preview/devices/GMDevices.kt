package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GM device specifications for Android Compose previews.
 *
 * This extension provides GM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GM: Any
  get() = object {
      /** DeviceSpec(manufacturer=GM, code=e-tab20, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=e-tab20, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val E_TAB20 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=e-tab20_variant, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=e-tab20_variant,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val E_TAB20_VARIANT = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G008, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G008, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G008 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G008_d, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G008_d, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G008_D = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G100, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G100, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val G100 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G300, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G300, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val G300 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=GM, code=G301, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G301, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val G301 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G310, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G310, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G310 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G312, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G312, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G312 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G314, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G314, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G314 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G316, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G316, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G316 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G318, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G318, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val G318 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=G501, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G501, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val G501 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=G510, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G510, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G510 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G512, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G512, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val G512 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=G514, width=1080, height=2412, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G514, width=1080,
      height=2412, dpi=480, isGoogleDevice=false).code */
      val G514 = "spec:width=1080,height=2412,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=G518, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G518, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val G518 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=G700, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G700, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val G700 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=G702, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G702, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val G702 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=G901, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=G901, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val G901 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=GM8_d_sprout, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=GM8_d_sprout, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GM8_D_SPROUT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=GM8_sprout, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=GM8_sprout, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GM8_SPROUT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GM, code=GM9PLUS_s, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=GM9PLUS_s, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val GM9PLUS_S = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=GM9PRO_d_sprout, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=GM9PRO_d_sprout,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val GM9PRO_D_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=GM, code=GM9PRO_sprout, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GM, code=GM9PRO_sprout, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val GM9PRO_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
