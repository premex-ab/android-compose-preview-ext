package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CIUSE_SRL device specifications for Android Compose previews.
 *
 * This extension provides CIUSE_SRL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CiuseSrl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CiuseSrl: Any
  get() = object {
      /** CIUSE_SRL CAB_TAB */
      val CAB_TAB = "spec:width=600,height=1024,unit=px,dpi=213"

  }
