package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Freebox device specifications for Android Compose previews.
 *
 * This extension provides Freebox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Freebox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Freebox: Any
  get() = object {
      /** DeviceSpec(manufacturer=Freebox, code=fbx6lc, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Freebox, code=fbx6lc, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val FBX6LC = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Freebox, code=fbx6lcv2, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Freebox, code=fbx6lcv2, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val FBX6LCV2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Freebox, code=fbx8am, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Freebox, code=fbx8am, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val FBX8AM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
