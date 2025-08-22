package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bic_Camera device specifications for Android Compose previews.
 *
 * This extension provides Bic_Camera device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BicCamera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BicCamera: Any
  get() = object {
      /** DeviceSpec(manufacturer=Bic_Camera, code=Si01BB, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Bic_Camera, code=Si01BB, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val SI01BB = "spec:width=768,height=1024,unit=px,dpi=160"

  }
