package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Punos device specifications for Android Compose previews.
 *
 * This extension provides Punos device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Punos.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Punos: Any
  get() = object {
      /** DeviceSpec(manufacturer=Punos, code=PTXR1024B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Punos, code=PTXR1024B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PTXR1024B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Punos, code=PTXR824B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Punos, code=PTXR824B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PTXR824B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Punos, code=Punos_10, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Punos, code=Punos_10, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PUNOS_10 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
