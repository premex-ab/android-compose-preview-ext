package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * nissan device specifications for Android Compose previews.
 *
 * This extension provides nissan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nissan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nissan: Any
  get() = object {
      /** nissan aivi2_b */
      val AIVI2_B = "spec:width=720,height=1920,unit=px,dpi=160"

      /** nissan aivi2_n_full */
      val AIVI2_N_FULL = "spec:width=720,height=1920,unit=px,dpi=160"

  }
