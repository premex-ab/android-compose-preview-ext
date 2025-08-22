package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Master-G device specifications for Android Compose previews.
 *
 * This extension provides Master-G device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MasterG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MasterG: Any
  get() = object {
      /** Master-G SENSE701 */
      val SENSE701 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
