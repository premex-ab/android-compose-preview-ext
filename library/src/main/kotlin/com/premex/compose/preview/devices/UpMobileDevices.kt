package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Up_Mobile device specifications for Android Compose previews.
 *
 * This extension provides Up_Mobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UpMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UpMobile: Any
  get() = object {
      /** Up_Mobile Mover_Edition */
      val MOVER_EDITION = "spec:width=1080,height=2460,unit=px,dpi=400"

  }
