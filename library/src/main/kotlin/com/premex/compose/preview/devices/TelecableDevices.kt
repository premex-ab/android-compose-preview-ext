package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Telecable device specifications for Android Compose previews.
 *
 * This extension provides Telecable device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telecable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telecable: Any
  get() = object {
      /** Telecable dtiw384 */
      val DTIW384 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
