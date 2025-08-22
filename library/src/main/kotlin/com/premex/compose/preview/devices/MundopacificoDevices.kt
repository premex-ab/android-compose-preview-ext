package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MundoPacifico device specifications for Android Compose previews.
 *
 * This extension provides MundoPacifico device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mundopacifico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mundopacifico: Any
  get() = object {
      /** MundoPacifico S2000 */
      val S2000 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MundoPacifico S3001 */
      val S3001 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
