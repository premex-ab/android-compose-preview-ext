package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MyPhone device specifications for Android Compose previews.
 *
 * This extension provides MyPhone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MyPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MyPhone: Any
  get() = object {
      /** DeviceSpec(manufacturer=MyPhone, code=myA17, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myA17, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MYA17 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myA18, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myA18, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val MYA18 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MyPhone, code=myA1_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myA1_Plus, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MYA1_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myG1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myG1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val MYG1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myP1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myP1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MYP1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=MyPhone_my96_DTV, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=MyPhone_my96_DTV,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val MYPHONE_MY96_DTV = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myT10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myT10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MYT10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MyPhone, code=myT5_DTV, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myT5_DTV, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MYT5_DTV = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MyPhone, code=myT6S, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myT6S, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val MYT6S = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MyPhone, code=myT6_DTV, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myT6_DTV, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val MYT6_DTV = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MyPhone, code=myT8, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myT8, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val MYT8 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MyPhone, code=myT8S, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myT8S, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val MYT8S = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MyPhone, code=myWX1_Plus, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myWX1_Plus,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val MYWX1_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myWX2, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myWX2, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val MYWX2 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myWX2_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myWX2_Pro, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val MYWX2_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myX12, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myX12, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val MYX12 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myX2, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myX2, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MYX2 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=MyPhone, code=myX8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myX8, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MYX8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myXI1_Plus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myXI1_Plus,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val MYXI1_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myXI1_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myXI1_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MYXI1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MyPhone, code=myXI3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MyPhone, code=myXI3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val MYXI3 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
