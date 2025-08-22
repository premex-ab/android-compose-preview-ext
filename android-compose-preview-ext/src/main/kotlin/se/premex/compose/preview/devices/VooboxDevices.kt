package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VOOBox device specifications for Android Compose previews.
 *
 * This extension provides VOOBox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Voobox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Voobox: Any
  get() = object {
      /** VOOBox SEI700TMM */
      val SEI700TMM = "spec:width=720,height=1280,unit=px,dpi=320"

  }
