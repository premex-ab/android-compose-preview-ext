package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HOME-ELITE device specifications for Android Compose previews.
 *
 * This extension provides HOME-ELITE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HomeElite.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HomeElite: Any
  get() = object {
      /** HOME-ELITE R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** HOME-ELITE R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
