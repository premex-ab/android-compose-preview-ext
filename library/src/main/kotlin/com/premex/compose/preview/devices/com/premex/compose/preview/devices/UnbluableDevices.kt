package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Unbluable device specifications for Android Compose previews.
 *
 * This extension provides Unbluable device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unbluable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unbluable: Any
  get() = object {
      /** DeviceSpec(manufacturer=Unbluable, code=PaperTablet, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Unbluable, code=PaperTablet,
      width=768, height=1024, dpi=160, isGoogleDevice=false).code */
      val PAPERTABLET = "spec:width=768,height=1024,unit=px,dpi=160"

  }
