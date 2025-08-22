package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Adreamer device specifications for Android Compose previews.
 *
 * This extension provides Adreamer device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Adreamer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Adreamer: Any
  get() = object {
      /** DeviceSpec(manufacturer=Adreamer, code=KidsPad10X, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Adreamer, code=KidsPad10X,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val KIDSPAD10X = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Adreamer, code=LeoPad20, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Adreamer, code=LeoPad20, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val LEOPAD20 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Adreamer, code=LeoPad_10X, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Adreamer, code=LeoPad_10X,
      width=800, height=1280, dpi=200, isGoogleDevice=false).code */
      val LEOPAD_10X = "spec:width=800,height=1280,unit=px,dpi=200"

  }
