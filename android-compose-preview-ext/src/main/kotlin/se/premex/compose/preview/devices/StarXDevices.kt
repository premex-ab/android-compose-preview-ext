package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * STAR-X device specifications for Android Compose previews.
 *
 * This extension provides STAR-X device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.StarX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.StarX: Any
  get() = object {
      /** STAR-X marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** STAR-X nagata */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** STAR-X tamachi */
      val TAMACHI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** STAR-X yeongdeungpo */
      val YEONGDEUNGPO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
