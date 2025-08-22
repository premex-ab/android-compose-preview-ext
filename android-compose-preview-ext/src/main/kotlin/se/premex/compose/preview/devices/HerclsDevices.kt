package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HERCLS device specifications for Android Compose previews.
 *
 * This extension provides HERCLS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hercls.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hercls: Any
  get() = object {
      /** HERCLS L925 */
      val L925 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
