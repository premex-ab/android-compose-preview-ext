package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kammunica device specifications for Android Compose previews.
 *
 * This extension provides Kammunica device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kammunica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kammunica: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kammunica, code=Kammunica_500V, width=480, height=854, dpi=205,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kammunica, code=Kammunica_500V,
      width=480, height=854, dpi=205, isGoogleDevice=false).code */
      val KAMMUNICA_500V = "spec:width=480,height=854,unit=px,dpi=205"

      /** DeviceSpec(manufacturer=Kammunica, code=Kammunica_800, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kammunica, code=Kammunica_800,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val KAMMUNICA_800 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Kammunica, code=Kammunica_XD, width=800, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kammunica, code=Kammunica_XD,
      width=800, height=1280, dpi=320, isGoogleDevice=false).code */
      val KAMMUNICA_XD = "spec:width=800,height=1280,unit=px,dpi=320"

  }
