package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TEKLIO device specifications for Android Compose previews.
 *
 * This extension provides TEKLIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teklio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teklio: Any
  get() = object {
      /** TEKLIO redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=213"

  }
