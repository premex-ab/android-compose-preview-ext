package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VTEX device specifications for Android Compose previews.
 *
 * This extension provides VTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vtex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vtex: Any
  get() = object {
      /** VTEX MT8768 */
      val MT8768 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VTEX VK102W */
      val VK102W = "spec:width=800,height=1280,unit=px,dpi=160"

      /** VTEX VK802W */
      val VK802W = "spec:width=800,height=1280,unit=px,dpi=188"

  }
