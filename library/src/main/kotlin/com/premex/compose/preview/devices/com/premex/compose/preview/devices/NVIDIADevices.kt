package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NVIDIA device specifications for Android Compose previews.
 *
 * This extension provides NVIDIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NVIDIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NVIDIA: Any
  get() = object {
      /** DeviceSpec(manufacturer=NVIDIA, code=darcy, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NVIDIA, code=darcy, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DARCY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NVIDIA, code=foster, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NVIDIA, code=foster, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val FOSTER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NVIDIA, code=mdarcy, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NVIDIA, code=mdarcy, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MDARCY = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NVIDIA, code=sif, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NVIDIA, code=sif, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SIF = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
