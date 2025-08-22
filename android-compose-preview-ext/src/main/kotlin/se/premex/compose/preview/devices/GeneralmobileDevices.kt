package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * GeneralMobile device specifications for Android Compose previews.
 *
 * This extension provides GeneralMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Generalmobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Generalmobile: Any
  get() = object {
      /** GeneralMobile Etab5 */
      val ETAB5 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** GeneralMobile mehmet */
      val MEHMET = "spec:width=800,height=1280,unit=px,dpi=160"

  }
