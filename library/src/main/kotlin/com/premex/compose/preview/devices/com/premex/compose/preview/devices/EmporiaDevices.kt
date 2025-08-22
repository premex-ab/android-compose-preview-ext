package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * emporia device specifications for Android Compose previews.
 *
 * This extension provides emporia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Emporia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Emporia: Any
  get() = object {
      /** DeviceSpec(manufacturer=emporia, code=E5mini, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=E5mini, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val E5MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=emporia, code=E6, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=E6, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val E6 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=emporia, code=E6mini, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=E6mini, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E6MINI = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=emporia, code=E7LT, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=E7LT, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val E7LT = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=emporia, code=S3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=S3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=emporia, code=S3mini, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=S3mini, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S3MINI = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=emporia, code=S4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=S4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=emporia, code=S5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=S5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val S5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=emporia, code=SE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=SE, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=emporia, code=TAB1, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=emporia, code=TAB1, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TAB1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
