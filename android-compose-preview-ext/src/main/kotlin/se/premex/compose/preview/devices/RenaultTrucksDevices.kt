package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * renault_trucks device specifications for Android Compose previews.
 *
 * This extension provides renault_trucks device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RenaultTrucks.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RenaultTrucks: Any
  get() = object {
      /** renault_trucks aivi2_r_full_dom */
      val AIVI2_R_FULL_DOM = "spec:width=720,height=1280,unit=px,dpi=160"

  }
