package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Disney device specifications for Android Compose previews.
 *
 * This extension provides Disney device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Disney.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Disney: Any
  get() = object {
      /** Disney Frozen_G9 */
      val FROZEN_G9 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
