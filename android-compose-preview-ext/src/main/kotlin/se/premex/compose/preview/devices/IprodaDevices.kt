package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * IPRODA device specifications for Android Compose previews.
 *
 * This extension provides IPRODA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iproda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iproda: Any
  get() = object {
      /** IPRODA T1045LI */
      val T1045LI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** IPRODA T1085P4LE */
      val T1085P4LE = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
