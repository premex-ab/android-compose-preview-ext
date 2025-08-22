package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HIGRACE device specifications for Android Compose previews.
 *
 * This extension provides HIGRACE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Higrace.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Higrace: Any
  get() = object {
      /** HIGRACE G15 */
      val G15 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HIGRACE OC101 */
      val OC101 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** HIGRACE OC101_EEA */
      val OC101_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
