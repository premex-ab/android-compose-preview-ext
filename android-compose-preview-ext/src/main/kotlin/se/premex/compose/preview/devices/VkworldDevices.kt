package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * vkworld device specifications for Android Compose previews.
 *
 * This extension provides vkworld device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vkworld.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vkworld: Any
  get() = object {
      /** vkworld VK7000 */
      val VK7000 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** vkworld vkworld_S8 */
      val VKWORLD_S8 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
