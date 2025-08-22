package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EVVOLI device specifications for Android Compose previews.
 *
 * This extension provides EVVOLI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Evvoli.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Evvoli: Any
  get() = object {
      /** EVVOLI R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EVVOLI R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EVVOLI R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** EVVOLI R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
