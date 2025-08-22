package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Intex device specifications for Android Compose previews.
 *
 * This extension provides Intex device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Intex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Intex: Any
  get() = object {
      /** DeviceSpec(manufacturer=Intex, code=Aqua_Ring, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Intex, code=Aqua_Ring, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AQUA_RING = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Intex, code=Aqua_Supreme_Plus, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Intex, code=Aqua_Supreme_Plus,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val AQUA_SUPREME_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
