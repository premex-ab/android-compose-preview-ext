package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HYTERA device specifications for Android Compose previews.
 *
 * This extension provides HYTERA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hytera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hytera: Any
  get() = object {
      /** HYTERA PDC550 */
      val PDC550 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
