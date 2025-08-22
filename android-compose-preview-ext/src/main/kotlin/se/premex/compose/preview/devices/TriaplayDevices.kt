package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TriaPlay device specifications for Android Compose previews.
 *
 * This extension provides TriaPlay device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Triaplay.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Triaplay: Any
  get() = object {
      /** TriaPlay TriaPlayBox */
      val TRIAPLAYBOX = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
