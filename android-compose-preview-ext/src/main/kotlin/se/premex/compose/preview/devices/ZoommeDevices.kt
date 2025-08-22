package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ZOOMME device specifications for Android Compose previews.
 *
 * This extension provides ZOOMME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zoomme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zoomme: Any
  get() = object {
      /** ZOOMME M2 */
      val M2 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ZOOMME M3 */
      val M3 = "spec:width=600,height=1280,unit=px,dpi=240"

  }
