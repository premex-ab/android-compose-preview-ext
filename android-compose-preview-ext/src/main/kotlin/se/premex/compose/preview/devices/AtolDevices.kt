package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ATOL device specifications for Android Compose previews.
 *
 * This extension provides ATOL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Atol.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Atol: Any
  get() = object {
      /** ATOL t150 */
      val T150 = "spec:width=480,height=800,unit=px,dpi=240"

      /** ATOL t50p */
      val T50P = "spec:width=480,height=800,unit=px,dpi=240"

  }
