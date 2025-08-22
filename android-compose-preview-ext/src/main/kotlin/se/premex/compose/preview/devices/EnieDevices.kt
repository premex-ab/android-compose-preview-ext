package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ENIE device specifications for Android Compose previews.
 *
 * This extension provides ENIE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Enie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Enie: Any
  get() = object {
      /** ENIE E4Pro */
      val E4PRO = "spec:width=640,height=1280,unit=px,dpi=320"

      /** ENIE EH3 */
      val EH3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ENIE ENIE_E2 */
      val ENIE_E2 = "spec:width=720,height=1560,unit=px,dpi=300"

      /** ENIE SKT119 */
      val SKT119 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** ENIE SKT706 */
      val SKT706 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ENIE VT8216 */
      val VT8216 = "spec:width=800,height=1280,unit=px,dpi=220"

  }
