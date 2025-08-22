package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * I-Bridge device specifications for Android Compose previews.
 *
 * This extension provides I-Bridge device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IBridge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IBridge: Any
  get() = object {
      /** I-Bridge IBT01H_BDS */
      val IBT01H_BDS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** I-Bridge IBT02H */
      val IBT02H = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
