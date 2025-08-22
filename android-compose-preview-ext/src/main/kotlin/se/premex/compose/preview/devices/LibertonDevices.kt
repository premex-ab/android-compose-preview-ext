package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LIBERTON device specifications for Android Compose previews.
 *
 * This extension provides LIBERTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Liberton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Liberton: Any
  get() = object {
      /** LIBERTON longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LIBERTON redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
