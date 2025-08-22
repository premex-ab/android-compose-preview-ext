package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Janam device specifications for Android Compose previews.
 *
 * This extension provides Janam device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Janam.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Janam: Any
  get() = object {
      /** Janam XG200 */
      val XG200 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Janam XG4 */
      val XG4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Janam XT2 */
      val XT2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Janam XT200 */
      val XT200 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Janam XT3 */
      val XT3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Janam XT30 */
      val XT30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Janam XT40 */
      val XT40 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
