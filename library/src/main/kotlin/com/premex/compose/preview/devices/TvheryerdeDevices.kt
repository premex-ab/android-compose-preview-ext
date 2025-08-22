package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVHerYerde device specifications for Android Compose previews.
 *
 * This extension provides TVHerYerde device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tvheryerde.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tvheryerde: Any
  get() = object {
      /** TVHerYerde DV8957X-KTT */
      val DV8957X_KTT = "spec:width=720,height=1280,unit=px,dpi=320"

  }
