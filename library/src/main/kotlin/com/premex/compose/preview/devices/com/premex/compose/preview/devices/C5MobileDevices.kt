package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * C5_Mobile device specifications for Android Compose previews.
 *
 * This extension provides C5_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.C5Mobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.C5Mobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=C5_Mobile, code=noa_x2_Plus, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=C5_Mobile, code=noa_x2_Plus,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val NOA_X2_PLUS = "spec:width=720,height=1520,unit=px,dpi=320"

  }
