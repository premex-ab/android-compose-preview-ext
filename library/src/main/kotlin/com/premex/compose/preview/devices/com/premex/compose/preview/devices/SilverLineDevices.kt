package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SilverLine device specifications for Android Compose previews.
 *
 * This extension provides SilverLine device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SilverLine.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SilverLine: Any
  get() = object {
      /** DeviceSpec(manufacturer=SilverLine, code=SL1021, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SilverLine, code=SL1021, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SL1021 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SilverLine, code=SL1022, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SilverLine, code=SL1022, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SL1022 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SilverLine, code=SL721, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SilverLine, code=SL721, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SL721 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
