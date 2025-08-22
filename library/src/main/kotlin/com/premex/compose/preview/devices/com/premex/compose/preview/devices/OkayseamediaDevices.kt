package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * okayseamedia device specifications for Android Compose previews.
 *
 * This extension provides okayseamedia device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Okayseamedia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Okayseamedia: Any
  get() = object {
      /** DeviceSpec(manufacturer=okayseamedia, code=TK706, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=okayseamedia, code=TK706,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TK706 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=okayseamedia, code=TK708, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=okayseamedia, code=TK708,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TK708 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=okayseamedia, code=TK708_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=okayseamedia, code=TK708_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TK708_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

  }
