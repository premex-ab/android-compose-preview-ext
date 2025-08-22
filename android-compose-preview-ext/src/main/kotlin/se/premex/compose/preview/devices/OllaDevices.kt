package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * OLLA device specifications for Android Compose previews.
 *
 * This extension provides OLLA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Olla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Olla: Any
  get() = object {
      /** OLLA M5 */
      val M5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** OLLA M6 */
      val M6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** OLLA M8 */
      val M8 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** OLLA Note3 */
      val NOTE3 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
