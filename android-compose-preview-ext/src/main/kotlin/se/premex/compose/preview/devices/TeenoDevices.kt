package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TEENO device specifications for Android Compose previews.
 *
 * This extension provides TEENO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Teeno.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Teeno: Any
  get() = object {
      /** TEENO A1_EEA */
      val A1_EEA = "spec:width=480,height=800,unit=px,dpi=240"

      /** TEENO TEENO_i12 */
      val TEENO_I12 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
