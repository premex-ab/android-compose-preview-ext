package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * JETPOINT device specifications for Android Compose previews.
 *
 * This extension provides JETPOINT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jetpoint.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jetpoint: Any
  get() = object {
      /** JETPOINT longshan */
      val LONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JETPOINT redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
