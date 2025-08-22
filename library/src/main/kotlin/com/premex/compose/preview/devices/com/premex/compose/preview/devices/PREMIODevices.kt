package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PREMIO device specifications for Android Compose previews.
 *
 * This extension provides PREMIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PREMIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PREMIO: Any
  get() = object {
      /** DeviceSpec(manufacturer=PREMIO, code=P520, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=P520, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P520 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PREMIO, code=S51, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S51, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S51 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PREMIO, code=S53, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S53, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val S53 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PREMIO, code=S73, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S73, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S73 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PREMIO, code=S80, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S80, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S80 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=S81, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S81, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val S81 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PREMIO, code=S82, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S82, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val S82 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PREMIO, code=S83, width=480, height=960, dpi=198,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S83, width=480,
      height=960, dpi=198, isGoogleDevice=false).code */
      val S83 = "spec:width=480,height=960,unit=px,dpi=198"

      /** DeviceSpec(manufacturer=PREMIO, code=S84, width=480, height=960, dpi=198,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S84, width=480,
      height=960, dpi=198, isGoogleDevice=false).code */
      val S84 = "spec:width=480,height=960,unit=px,dpi=198"

      /** DeviceSpec(manufacturer=PREMIO, code=S85, width=480, height=960, dpi=198,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S85, width=480,
      height=960, dpi=198, isGoogleDevice=false).code */
      val S85 = "spec:width=480,height=960,unit=px,dpi=198"

      /** DeviceSpec(manufacturer=PREMIO, code=S88, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S88, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val S88 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PREMIO, code=S89, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S89, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val S89 = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PREMIO, code=S93, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=S93, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val S93 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=TAB7, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=TAB7, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TAB7 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PREMIO, code=TAB8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=TAB8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB8 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PREMIO, code=TAB_7_1, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=TAB_7_1, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val TAB_7_1 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PREMIO, code=TAB_8_1, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=TAB_8_1, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val TAB_8_1 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=PREMIO, code=X76, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=X76, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X76 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=X77, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=X77, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X77 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=X82, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=X82, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X82 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=X87, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=X87, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X87 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=X88, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=X88, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val X88 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=X95, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=X95, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X95 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=X96, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=X96, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X96 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=X97, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=X97, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val X97 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PREMIO, code=Z1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PREMIO, code=Z1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val Z1 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
