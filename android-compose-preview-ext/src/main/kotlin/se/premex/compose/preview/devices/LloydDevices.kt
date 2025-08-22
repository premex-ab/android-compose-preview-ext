package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * LLOYD device specifications for Android Compose previews.
 *
 * This extension provides LLOYD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lloyd.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lloyd: Any
  get() = object {
      /** LLOYD R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** LLOYD R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** LLOYD R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** LLOYD SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** LLOYD umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
